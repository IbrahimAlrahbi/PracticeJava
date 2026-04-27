package chatBot;

import com.google.gson.JsonParser;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class ChatBot {
    public static void main(String[] args) {

        // Step 1: Your API Key
        final String OPENAI_API_KEY = "YOUR_OPENAI_API_KEY";

        //  The question you want to ask
        String question = "Can you tell me briefly about the history of Oracle?";

        System.out.println("******** This is Agile Oracles Chat Bot ********");

        // Step 2: Build the JSON body
        String requestBody = """
                {
                    "model": "gpt-4.1-mini",
                    "messages": [
                        {"role": "user", "content": "%s"}
                    ]
                }
                """.formatted(question);

        // Step 3: Send the request to OpenAI
        HttpResponse<String> response = Unirest
                .post("https://api.openai.com/v1/chat/completions")
                .header("Authorization", "Bearer " + OPENAI_API_KEY)
                .header("Content-Type", "application/json")
                .body(requestBody)
                .asString();

        //  Step 4: Extract the answer from the response
        //  parsing: understanding and validating
        String answer = JsonParser.parseString(response.getBody())
                .getAsJsonObject()
                .getAsJsonArray("choices")
                //  getting the first index JSON element - and return with object JSON type
                .get(0)
                .getAsJsonObject()
                //  getting the message key and get value - message is JSON element
                .getAsJsonObject("message")
                //  get content as String
                .get("content")
                .getAsString();


        System.out.println(answer);
    }
}
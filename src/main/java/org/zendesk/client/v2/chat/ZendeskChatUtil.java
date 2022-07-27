package org.zendesk.client.v2.chat;

import feign.Response;
import org.zendesk.client.v2.ZendeskResponseException;

import java.io.IOException;
import java.io.Reader;

public class ZendeskChatUtil {

    public static String mapBody(Response.Body body) throws IOException {
        Reader reader = body.asReader();
        char[] buffer = new char[8 * 1024];
        StringBuilder stringBuffer = new StringBuilder();
        int charsRead;
        while ((charsRead = reader.read(buffer, 0, buffer.length)) != -1) {
            stringBuffer.append(buffer, 0, charsRead);
        }
        reader.close();
        return stringBuffer.toString();
    }

    public static Exception decode(String s, Response response) {
        String body;
        try {
            body = mapBody(response.body());
        } catch (IOException e) {
            return new Exception("Zendesk chat client error: " + response.reason());
        }
        return new ZendeskResponseException(response.status(), response.reason(), body);
    }

}

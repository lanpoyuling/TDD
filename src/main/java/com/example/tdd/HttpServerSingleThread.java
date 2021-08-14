package com.example.tdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName HttpServerSingleThread
 * @Description 单线程的socket
 * @Author 10932
 * @Date 8/14/2021 9:38 AM
 **/
public class HttpServerSingleThread {
    private static Logger logger = LoggerFactory.getLogger(HttpServerSingleThread.class);

    public static void main(String[] args) {
        int k = 0;
        boolean flag = true;
        try (ServerSocket serverSocket = new ServerSocket(8801)) {
            while (flag) {
                k++;
                Socket socket = serverSocket.accept();
                service(socket);
                flag = k < Integer.MAX_VALUE;
            }
        } catch (IOException e) {
            logger.error("{}", e.getMessage(), e);
        }
    }

    private static void service(Socket socket) throws IOException {
        try (PrintWriter printWriter = new PrintWriter(socket.getOutputStream())) {
            printWriter.println("HTTP/1.1 200 OK");
            printWriter.println("Content-Type:text/html;charset=utf-8");
            String body = "hello,nio";
            printWriter.println("Content-Length:" + body.getBytes(StandardCharsets.UTF_8).length);
            printWriter.println("");
            printWriter.println(body);
        }

    }
}

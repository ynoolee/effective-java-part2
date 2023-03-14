package me.whiteship.hello;

import me.whiteship.name.NameService;

public class HelloService {

    public static void main(String[] args) {
        String name = new NameService().getName();

        System.out.println("Hello," + name + " Maven!");
    }
}

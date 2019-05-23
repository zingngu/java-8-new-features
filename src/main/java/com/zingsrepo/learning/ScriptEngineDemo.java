package com.zingsrepo.learning;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptEngineDemo {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        System.out.println(engine.getClass().getName());
        try {
            System.out.println("Result:" + engine.eval("function f() { return 10; }; f() * 24;"));
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}

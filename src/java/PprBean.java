//package org.primefaces.examples.view;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class PprBean implements Serializable {

    private String command;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;

        switch (command) {
            case "version":
                result = "=== ver 0.2 === 2014-4-23, 16:40,\n by Mark";

            default:
                result = " Value 1: 0[時代A內政-戰士-科技] 1[時代A內政-藝術作品-行動] 2[時代A內政-亞里士多得-領袖] 3[時代A內政-建築工地-行動] 4[時代A內政-亞歷山大圖書館-奇蹟] \n"
                        + "   Value 2: 5[時代A內政-摩西-領袖] 6[時代A內政-工程天才-行動] 7[時代A內政-亞歷山大大帝-領袖] 8[時代A內政-專制-科技] \n"
                        + "   Value 3: 9[時代A內政-凱薩-領袖] 10[時代A內政-空中花園-奇蹟] 11[時代A內政-農業-科技] 12[時代A內政-巨人像-奇蹟] ";

        }

    }
    private String result;

    public String getResult() {

        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}

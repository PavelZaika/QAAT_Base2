package com.Google;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class test {

    @Test
    public void googleSearch() {
        Configuration.browser = "Chrome";
        WebDriverManager.chromedriver().setup();
        open("https://www.google.com/");
        $(By.name("q")).setValue("Selenium").pressEnter();


        $$("#ires div.g").shouldHave(sizeGreaterThan(10));
        $("#ires div.g").shouldHave(text("selenium — это инструмент для автоматизации"));
        System.out.println("Done");

    }


}

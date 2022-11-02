package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class TaskPage extends BasePageObject {
    private By taskHeader = By.xpath("//android.widget.TextView[@text = 'My Task']");
    private By AddBtn = MobileBy.AccessibilityId("Android Room");
    private By taskTitleField = By.id("editTextTaskTitle");
    private By taskContentField = By.id("editTextTaskContent");
    private By saveBtn = By.id("buttonApply");
    private By taskTitle = By.id("textViewTaskTitle");

    private By errorSign = MobileBy.AccessibilityId("Error");

    private By errorText = By.id("textinput_error");

    public void taskHeaderDisplayed() {
        isDisplayed(taskHeader);
    }

    public void clickAddBtn() {
        click(AddBtn);
    }

    public void inputTaskTitle(String title) {
        inputText(taskTitleField, title);
    }

    public void inputTaskContent(String content) {
        inputText(taskContentField, content);
    }

    public void clickSaveBtn() {
        click(saveBtn);
    }

    public void taskAdded() {
        isDisplayed(taskTitle);
    }

    public void titleEmptyError() {
        isDisplayed(errorSign);
        assertThat(getText(errorText).equals("Title is Empty"));
    }

    public void contentEmptyError() {
        isDisplayed(errorSign);
        assertThat(getText(errorText).equals("Content is Empty"));
    }
}

package org.example

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.assertEquals

class StepDefinitions {

    private lateinit var today: String
    private lateinit var actualAnswer: String

    @Given("today is {string}")
    fun today_is_Sunday(today: String) {
        this.today = today
    }

    @When("I ask whether it's Friday yet")
    fun i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today)
    }

    @When("I ask whether it's Sunday yet")
    fun i_ask_whether_it_s_Sunday_yet() {
        actualAnswer = IsItSunday.isItSunday(today)
    }

    @Then("I should be told {string}")
    fun i_should_be_told(expectedAnswer: String?) {
        assertEquals(expectedAnswer, actualAnswer)
    }
}

internal object IsItFriday {
    fun isItFriday(today: String?): String {
        return if (today.equals("Friday")) "TGIF" else "Nope"
    }
}

internal object IsItSunday {
    fun isItSunday(today: String?): String {
        return if (today.equals("Sunday")) "Football!" else "Nope"
    }
}
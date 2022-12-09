

    import com.codeborne.selenide.Condition;
 import com.codeborne.selenide.commands.SelectRadio;
 import com.codeborne.selenide.selector.ByText;
 import org.junit.Test;
 import org.openqa.selenium.By;


 import java.time.Duration;

 import static com.codeborne.selenide.Selectors.*;
 import static com.codeborne.selenide.Selenide.open;
 import static com.codeborne.selenide.Selenide.*;



    public class HW4 {
        @Test
        public void Hw_4() {

            open("https://www.facebook.com");
            $(byText("Create new account")).click();
            $(byName("firstname")).setValue("Avto");
            $(byName("lastname")).setValue("Bezhaneishvili");
            $(byName("reg_email__")).setValue("avtandilius@mail.com");
            $(byName("reg_passwd__")).setValue("facebook1993");
            $(byName("reg_email_confirmation__")).setValue("avtandilius@mail.com");
            $("#day").selectOption("16");
            $("#month").selectOption("Oct");
            $("#year").selectOption("1993");
            $(byText("Custom")).click();
            $(byName("preferred_pronoun")).shouldBe(Condition.visible, Duration.ofMillis(2000));
            $(byName("custom_gender")).shouldBe(Condition.visible, Duration.ofMillis(2000));
            $(byText("Male")).click();
            $(byName("preferred_pronoun")).shouldBe(Condition.disappear);
            $(byName("preferred_pronoun")).shouldBe(Condition.disappear);

            sleep(5000);



        }
    }
}

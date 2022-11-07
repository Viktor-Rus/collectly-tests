package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private SelenideElement
            mainLogo = $("img[class='brand-logo']"),
            navTabAbout =$("a[href='#about']"),
            navTabSolutions =$("a[href='#features'] div.menu-link"),
            navTabTestimonials =$("a[href='#reviews']"),
            navTabPlans =$("a[href='#pricing']"),
            navTabPayYourBill =$("a[href='http://pay.collectly.co']"),
            navTabLogin =$("a[href='http://app.collectly.co']"),
            iconChat = $("div[aria-label*='chat'] path");

    public SelenideElement getMainLogo(){ return mainLogo; }
    public SelenideElement getNavTabAbout(){ return navTabAbout; }
    public SelenideElement getIconChat(){ return iconChat; }
    public SelenideElement getNavTabSolutions(){ return navTabSolutions; }
    public SelenideElement getNavTabTestimonials(){ return navTabTestimonials; }
    public SelenideElement getNavTabPlans(){ return navTabPlans; }
    public SelenideElement getNavTabPayYourBill(){ return navTabPayYourBill; }
    public SelenideElement getNavTabLogin(){ return navTabLogin; }


    public MainPage openMainPage() {
        open(Configuration.baseUrl);
        return this;
    }





}

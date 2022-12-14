package baigiamasis.page;

public class LoginPage {
    public static void openUrl(String url) {
        Common.openUrl(url);
    }

    public static void close() {
        Common.close();
    }

    public static void enterElPastas(String email) {
        Common.sendKeysToElement(
                Locators.Login.inputEmail, email
        );
    }

    public static void enterSlaptazodis(String password) {
        Common.sendKeysToElement(
                Locators.Login.inputPassword, password
        );
    }

    public static void clickButtonPrisijungti() {
        Common.clickElement(
                Locators.Login.buttonSubmit
        );
    }

    public static void moveToButtonUserLoginByAction() {
        Common.MoveToButtonLoginByAction(
                Locators.Login.menuUserLogin
        );
    }

    public static void clickButtonLoginByAction() {
        Common.clickElement(
                Locators.Login.buttonLogin
        );
    }

    public static String readMessageOfLogin() {
        return Common.getTextFromElement(
                Locators.Login.paragraphLoginMessage
        );
    }

    public static void moveToButtonUserByAction() {
        Common.MoveToButtonLoginByAction(
                Locators.Login.menuUser
        );
    }

    public static void clickButtonAtsijungtiByAction() {
        Common.clickElement(
                Locators.Login.buttonLogout
        );
    }

    public static String readMessageOfLogout() {
        return Common.getTextFromElement(
                Locators.Login.paragraphLogoutMessage
        );
    }

    public static void clickButtonKeistiPaskyrosInformcija() {
        Common.clickElement(
                Locators.Login.buttonChangeProfileInformation
        );
    }

    public static void enterVardas(String inputText) {
        String vardas = Common.getAttributeValue(Locators.Login.inputName);
        String vardasAntras = "Testukas";

        if (vardas.equals(inputText)) {
            Common.sendKeysToElement(
                    Locators.Login.inputName, vardasAntras
            );
        } else {
            Common.sendKeysToElement(
                    Locators.Login.inputName, inputText
            );
        }
    }

    public static String readMessageOfNameChanged() {
        return Common.getTextFromElement(
                Locators.Login.paragraphChangesMessage
        );
    }

    public static void clickButtonTesti() {
        Common.clickElement(
                Locators.Login.buttonInputSubmit
        );
    }

    public static void selectAllTextFromField() {
        Common.selectAllText();
    }

    public static void clickOnVardasField() {
        Common.clickElement(
                Locators.Login.inputName
        );
    }
}

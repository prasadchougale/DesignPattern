package Design.Pattern.Adapter;

interface WebDriver {
    public void getElement();

    public void setElement();
}

class Chromedriver implements WebDriver {
    @Override
    public void getElement() {
        System.out.println("Get element form chromedriver");
    }

    @Override
    public void setElement() {
        System.out.println("Set element from chromedriver");
    }
}

class IEDriver {
    public void findElement() {
        System.out.println("Find Element from IEDriver");
    }

    public void clickElement() {
        System.out.println("Click Element form IEDriver");
    }
}

class WebDriverAdapter implements WebDriver {
    IEDriver ieDriver;

    public WebDriverAdapter(IEDriver ieDriver) {
        this.ieDriver = ieDriver;
    }

    public void getElement() {
        ieDriver.findElement();
    }

    @Override
    public void setElement() {
        ieDriver.clickElement();
    }
}

public class AdapterDesignPattern {
    public static void main(String[] args) {
        Chromedriver c = new Chromedriver();
        c.getElement();
        c.setElement();

        IEDriver e = new IEDriver();
        e.findElement();
        e.clickElement();

        WebDriver wid = new WebDriverAdapter(e);
        wid.getElement();
        wid.setElement();


    }

}

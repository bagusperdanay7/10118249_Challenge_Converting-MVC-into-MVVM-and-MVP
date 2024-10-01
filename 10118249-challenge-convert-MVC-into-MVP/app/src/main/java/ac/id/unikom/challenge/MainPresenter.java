package ac.id.unikom.challenge;

public class MainPresenter {
    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    public void calculateSizeMeter(String meter) {
        if (meter.isEmpty())
            meter = "0";

        Meter modelMeter = new Meter();
        double parsedMeter = Double.parseDouble(meter);
        modelMeter.setMeter(parsedMeter);

        String centimeter = modelMeter.toCentimeter() + "";
        String kilometer = modelMeter.toKilometer() + "";

        view.showCentimeter(centimeter);
        view.showKilometer(kilometer);
    }
}

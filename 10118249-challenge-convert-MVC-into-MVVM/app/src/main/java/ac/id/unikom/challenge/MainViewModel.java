package ac.id.unikom.challenge;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private final MutableLiveData<Meter> meterModel;

    public MainViewModel() {
        this.meterModel = new MutableLiveData<>();
    }

    public LiveData<Meter> getMeter() {
        return this.meterModel;
    }

    public void setMeter(String meter) {
        if (meter.isEmpty())
            meter = "0";

        double parsedMeter = Double.parseDouble(meter);

        Meter meterObjek = new Meter();
        meterObjek.setMeter(parsedMeter);

        this.meterModel.setValue(meterObjek);
    }
}

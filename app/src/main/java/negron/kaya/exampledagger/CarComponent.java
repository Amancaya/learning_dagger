package negron.kaya.exampledagger;

import dagger.Component;
import negron.kaya.exampledagger.dagger.DieselEngineModule;
import negron.kaya.exampledagger.models.Car;

@Component(modules =  {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}

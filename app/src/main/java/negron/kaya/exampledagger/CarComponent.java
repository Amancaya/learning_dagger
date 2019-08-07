package negron.kaya.exampledagger;

import javax.inject.Named;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import negron.kaya.exampledagger.dagger.DieselEngineModule;
import negron.kaya.exampledagger.dagger.PetrolEngineModule;
import negron.kaya.exampledagger.models.Car;
import negron.kaya.exampledagger.models.PetrolEngine;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface BuilderOther {

        @BindsInstance
        BuilderOther horsePower(@Named("horse") int horsePower);

        @BindsInstance
        BuilderOther engineCapacity(@Named("engine") int engineCapacity);

        CarComponent build();
    }
}

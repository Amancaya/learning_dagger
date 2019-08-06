package negron.kaya.exampledagger;

import dagger.Module;
import dagger.Provides;
import negron.kaya.exampledagger.models.Rims;
import negron.kaya.exampledagger.models.Tires;
import negron.kaya.exampledagger.models.Wheels;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}

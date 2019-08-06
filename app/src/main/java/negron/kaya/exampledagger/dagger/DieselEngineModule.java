package negron.kaya.exampledagger.dagger;

import dagger.Module;
import dagger.Provides;
import negron.kaya.exampledagger.models.DieselEngine;
import negron.kaya.exampledagger.models.Engine;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine() {
        return new DieselEngine(horsePower);
    }
}

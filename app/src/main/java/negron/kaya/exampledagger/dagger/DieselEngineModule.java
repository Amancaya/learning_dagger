package negron.kaya.exampledagger.dagger;

import dagger.Binds;
import dagger.Module;
import negron.kaya.exampledagger.models.DieselEngine;
import negron.kaya.exampledagger.models.Engine;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}

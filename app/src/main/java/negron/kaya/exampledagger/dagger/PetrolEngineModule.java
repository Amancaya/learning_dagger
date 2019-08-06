package negron.kaya.exampledagger.dagger;

import dagger.Binds;
import dagger.Module;
import negron.kaya.exampledagger.models.Engine;
import negron.kaya.exampledagger.models.PetrolEngine;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}

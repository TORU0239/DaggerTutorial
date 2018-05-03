package my.com.toru.daggertutorial.ui.other.di;

import dagger.Module;
import dagger.Provides;
import my.com.toru.daggertutorial.ui.other.utils.DummyDependency;
import my.com.toru.daggertutorial.ui.other.utils.DummyPushLibrary;
import my.com.toru.daggertutorial.ui.other.utils.OtherDependency;
import my.com.toru.daggertutorial.ui.other.utils.Util;

@Module
public class DummyDependModule {
    @Provides
    DummyDependency getDummyDependency(){
        return new DummyDependency();
    }

    @Provides
    DummyPushLibrary getPushLibrary(){
        return new DummyPushLibrary();
    }

    @Provides
    OtherDependency getOtherDependency(){
        return new OtherDependency();
    }

    @Provides
    Util getUtil(){
        return new Util();
    }
}
package my.com.toru.daggertutorial.ui.other;

import dagger.Subcomponent;
import my.com.toru.daggertutorial.ui.other.di.DummyDependModule;

@Subcomponent(modules = DummyDependModule.class)
public interface OtherActivityComponent {
    void inject(OtherActivity activity);

    @Subcomponent.Builder
    interface Builder{
        Builder dummyDependModule(DummyDependModule module);
        OtherActivityComponent build();
    }
}
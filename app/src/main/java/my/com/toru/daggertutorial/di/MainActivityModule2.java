package my.com.toru.daggertutorial.di;

import dagger.Module;
import dagger.Provides;
import my.com.toru.daggertutorial.remote.Test1;

@Module
public class MainActivityModule2 {
    @Provides
    Test1 getTest(){
        return new Test1();
    }
}
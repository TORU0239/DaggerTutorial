package my.com.toru.daggertutorial.di;

import dagger.Module;
import dagger.Provides;
import my.com.toru.daggertutorial.Test1;
import my.com.toru.daggertutorial.Test2;

@Module
public class MainActivityModule {
    @Provides
    Test1 getTest(){
        return new Test1();
    }

    @Provides
    Test2 getTest2(){
        return new Test2();
    }
}
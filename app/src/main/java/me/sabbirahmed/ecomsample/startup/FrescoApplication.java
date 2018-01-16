package me.sabbirahmed.ecomsample.startup;

import android.app.Application;
import me.sabbirahmed.ecomsample.cache.ImagePipelineConfigFactory;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by sabbir on 2015/6/24.
 */
public class FrescoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this, ImagePipelineConfigFactory.getImagePipelineConfig(this));
    }

}

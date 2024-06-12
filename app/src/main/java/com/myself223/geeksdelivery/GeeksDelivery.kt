package com.myself223.geeksdelivery

import android.app.Application
import com.myself223.geeksdelivery.data.module.networkModule
import com.myself223.geeksdelivery.data.module.repoModule
import com.myself223.geeksdelivery.domain.module.useCaseModule
import com.myself223.geeksdelivery.presentation.module.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class GeeksDelivery:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@GeeksDelivery)
            modules(networkModule, repoModule, useCaseModule, uiModule)
        }
    }


}
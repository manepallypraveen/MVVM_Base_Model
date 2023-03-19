package nitro.network

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import nitro.network.data.di.AppModule
import nitro.network.data.di.NetworkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {

    private var mInstance: nitro.network.App? = null

    override fun onCreate() {
        super.onCreate()

        mInstance = this
        try {
        } catch (e: Exception) {
        }

        MultiDex.install(this)
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(listOf(AppModule, NetworkModule))
        }

    }

    fun getInstance(): Context? {
        return mInstance
    }

}

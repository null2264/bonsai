package kodama.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import kodama.core.di.initKoin
import kodama.ui.App
import kodama.ui.di.preferenceModule
import kodama.ui.theme.KodamaTheme

fun main() {
    initKoin(
        additionalDeclaration = {
            modules(preferenceModule)
        },
    )
    application {
        Window(onCloseRequest = ::exitApplication, title = "Kodama") {
            KodamaTheme { _ ->
                App()
            }
        }
    }
}

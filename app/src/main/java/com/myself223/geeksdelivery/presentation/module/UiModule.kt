package com.myself223.geeksdelivery.presentation.module

import com.myself223.geeksdelivery.presentation.ui.fragments.menu.MenuFragmentViewModel
import org.koin.dsl.module


val uiModule = module {
    single { MenuFragmentViewModel(get())}
}
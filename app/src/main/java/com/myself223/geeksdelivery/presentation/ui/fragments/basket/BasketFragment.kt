package com.myself223.geeksdelivery.presentation.ui.fragments.basket

import com.myself223.geeksdelivery.databinding.FragmentBasketBinding
import com.myself223.geeksdelivery.presentation.base.BaseFragment

class BasketFragment : BaseFragment<FragmentBasketBinding>() {
    override fun getViewBinding(): FragmentBasketBinding {
        return FragmentBasketBinding.inflate(layoutInflater)
    }

}
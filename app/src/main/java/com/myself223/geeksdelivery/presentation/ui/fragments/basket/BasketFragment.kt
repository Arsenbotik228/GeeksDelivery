package com.myself223.geeksdelivery.presentation.ui.fragments.basket

import by.kirich1409.viewbindingdelegate.viewBinding
import com.myself223.geeksdelivery.R
import com.myself223.geeksdelivery.databinding.FragmentBasketBinding
import com.myself223.geeksdelivery.presentation.base.BaseFragment
import com.myself223.geeksdelivery.presentation.base.BaseViewModel

class BasketFragment : BaseFragment<FragmentBasketBinding,BasketViewModel>(R.layout.fragment_basket) {

    override val binding: FragmentBasketBinding by viewBinding(FragmentBasketBinding::bind)
    override val viewModel = BasketViewModel()

}

package com.myself223.geeksdelivery.presentation.ui.fragments.profile

import com.myself223.geeksdelivery.databinding.FragmentProfileBinding
import com.myself223.geeksdelivery.presentation.base.BaseFragment


class ProfileFragment : BaseFragment<FragmentProfileBinding>() {
    override fun getViewBinding(): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(layoutInflater)
    }

}
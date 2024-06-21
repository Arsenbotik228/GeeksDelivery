package com.myself223.geeksdelivery.presentation.ui.fragments.profile

import by.kirich1409.viewbindingdelegate.viewBinding
import com.myself223.geeksdelivery.R
import com.myself223.geeksdelivery.databinding.FragmentProfileBinding
import com.myself223.geeksdelivery.presentation.base.BaseFragment


class ProfileFragment : BaseFragment<FragmentProfileBinding,ProfileViewModel>(R.layout.fragment_profile) {
    override val binding: FragmentProfileBinding by viewBinding (FragmentProfileBinding::bind)
    override val viewModel =  ProfileViewModel()

}

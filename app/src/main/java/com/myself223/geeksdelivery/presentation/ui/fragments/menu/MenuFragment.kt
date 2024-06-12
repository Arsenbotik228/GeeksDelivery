package com.myself223.geeksdelivery.presentation.ui.fragments.menu


import android.util.Log
import androidx.lifecycle.lifecycleScope
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.myself223.geeksdelivery.databinding.FragmentMenuBinding
import com.myself223.geeksdelivery.presentation.base.BaseFragment
import com.myself223.geeksdelivery.presentation.model.Resourse
import com.myself223.geeksdelivery.presentation.ui.adapters.menu_adapters.CategoryAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MenuFragment: BaseFragment<FragmentMenuBinding>() {
    private val viewModel:MenuFragmentViewModel by viewModel()

    private val adapter: CategoryAdapter by lazy { CategoryAdapter() }

    override fun getViewBinding(): FragmentMenuBinding {
        return FragmentMenuBinding.inflate(layoutInflater)
    }

    override fun initialize() {
        binding.rvCategory.adapter = adapter
            viewModel.getAllCategory()


            viewModel.categories.observe(viewLifecycleOwner) {
                when (it) {
                    is Resourse.Loading -> Log.e("ololo", "loading")
                    is Resourse.Success -> {
                        adapter.submitList(it.data?.categories)

                    }

                    is Resourse.Error -> Log.e("ololo", "${it.message}")
                }
            }
        }
}
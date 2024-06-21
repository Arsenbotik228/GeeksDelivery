package com.myself223.geeksdelivery.presentation.ui.fragments.menu

import android.os.Bundle
import android.widget.Toast
import by.kirich1409.viewbindingdelegate.viewBinding
import com.myself223.geeksdelivery.R
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.myself223.geeksdelivery.databinding.FragmentMenuBinding
import com.myself223.geeksdelivery.presentation.base.BaseFragment
import com.myself223.geeksdelivery.presentation.model.MealUi
import com.myself223.geeksdelivery.presentation.ui.adapters.menu_adapters.CategoryAdapter
import com.myself223.geeksdelivery.presentation.ui.adapters.menu_adapters.MealAdapter

class MenuFragment : BaseFragment<FragmentMenuBinding, MenuViewModel>(R.layout.fragment_menu) {
    override val binding: FragmentMenuBinding by viewBinding(FragmentMenuBinding::bind)
    override val viewModel: MenuViewModel by viewModel()
    private val categoryAdapter: CategoryAdapter by lazy { CategoryAdapter(this::click) }
    private val mealAdapter: MealAdapter by lazy { MealAdapter() }

    override fun init() {
        binding.rvCategory.adapter = categoryAdapter
        binding.rvMeals.adapter = mealAdapter
    }

    private fun click(nameCategory: String) {
        viewModel.getMealsByCategory(nameCategory)
    }

    override fun launchObserver() {
        viewModel.getAllCategory()
        viewModel.categoriesState.observeUIState(success = { categories ->
            categoryAdapter.submitList(categories)
        }, error = { ex ->
            Toast.makeText(requireContext(), ex, Toast.LENGTH_SHORT).show()
        })

        viewModel.mealsState.observeUIState(success = { meals ->
            mealAdapter.submitList(meals)
        }, error = { ex ->
            Toast.makeText(requireContext(), ex, Toast.LENGTH_SHORT).show()
        })
    }
}

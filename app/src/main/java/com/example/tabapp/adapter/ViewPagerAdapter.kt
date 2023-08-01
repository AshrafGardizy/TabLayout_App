package com.example.tabapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tabapp.fragments.BooksFragment
import com.example.tabapp.fragments.GameFragments
import com.example.tabapp.fragments.MoviesFragment

class ViewPagerAdapter (fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {
    var numberOFTabs = 3
    override fun getItemCount(): Int {
        return  this.numberOFTabs
    }

    override fun createFragment(position: Int): Fragment {
        when(position)
        {
            0->{return  BooksFragment()}
            1->{return GameFragments()}
        }
        return MoviesFragment()
    }
}
package com.example.tablayoutapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayoutapp.fragments.booksFragment
import com.example.tablayoutapp.fragments.gamesFragment
import com.example.tablayoutapp.fragments.movieFragment


// A FragmentStateAdapter can have (fragmentManager , lifecycle) as input or (fragment) or (fragmentActivity) so accordingly choose the parameters of the subclass i.e viewPagerAdapter (i.e. MyAdapter)
// Implement the class member functions
class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {
    val fragment_size = 3
    override fun getItemCount(): Int {
       return this.fragment_size
    }
    override fun createFragment(position: Int): Fragment {
        when(position){
            0-> return  booksFragment()
            1-> return movieFragment()
            2-> return  gamesFragment()
        }
        return booksFragment()

    }
}
package com.savvycom.news.ui.news_list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.savvycom.news.base.BaseFragment
import com.savvycom.news.databinding.FragmentNewsListBinding
import com.savvycom.news.models.News

class NewsListFragment : BaseFragment() {

    companion object {
        fun newInstance() = NewsListFragment()
    }

    private lateinit var binding: FragmentNewsListBinding
    private lateinit var viewModel: NewsListViewModel
    private lateinit var adapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[NewsListViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        adapter = NewsAdapter()
        binding.rcvNewsList.adapter = adapter
        adapter.submit(
            listOf(
                News(
                    title = "The title",
                    description = "The description",
                    imageUrl = "https://cdn.vox-cdn.com/thumbor/a1UuqmTXeWu_sDyVAVipeGpIQ0s=/0x0:2040x1360/1200x628/filters:focal(1020x680:1021x681)/cdn.vox-cdn.com/uploads/chorus_asset/file/24016885/STK093_Google_04.jpg",
                    content = "The content",
                    publishedAt = "Published date"
                )
            )
        )
        super.onViewCreated(view, savedInstanceState)
    }

}
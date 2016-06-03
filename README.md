# SwipeRefreshLoad
SwipeRefreshLoad
用于下拉刷新和上拉加载更多

添加依赖：
compile 'com.yinbiao:SwipeRefreshLoad:1.0.1'

布局：

    <com.swiprefreshload.SwipeRefreshLoadLayout
        android:id="@+id/swipe"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <android.support.v7.widget.RecyclerView
            android:id="@+id/list"
            android:layout_width="match_parent"
            android:layout_height="match_parent"></android.support.v7.widget.RecyclerView>

    </com.swiprefreshload.SwipeRefreshLoadLayout>
    
代码：
        mSwipeRefreshLayout = (SwipeRefreshLoadLayout) findViewById(R.id.swipe);
        
        mSwipeRefreshLayout.setDirection(SwipeDirection.BOTH);
        
        mSwipeRefreshLayout.setOnRefreshListener(this);
        
        mSwipeRefreshLayout.setOnLoadMoreListener(this);

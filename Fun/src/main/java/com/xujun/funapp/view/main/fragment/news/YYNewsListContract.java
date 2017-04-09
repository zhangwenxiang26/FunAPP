package com.xujun.funapp.view.main.fragment.news;

import com.xujun.funapp.common.mvp.BasePresenter;
import com.xujun.funapp.common.mvp.BaseView;

/**
 * @ explain:
 * @ author：xujun on 2016/10/27 23:40
 * @ email：gdutxiaoxu@163.com
 */
public class YYNewsListContract {

    public interface View<T> extends BaseView<T> {

        void onReceiveNews(String result);
        void onReceiveNewsError(Throwable error);

    }

    public interface Presenter extends BasePresenter {

        void getNews(String channelId, String channelName, int page, int maxResult);

    }
}

package com.example.gustavo.petsandroid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.mindorks.placeholderview.SwipeDecor
import com.mindorks.placeholderview.SwipePlaceHolderView
import com.mindorks.placeholderview.SwipeViewBuilder
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var mContext: Context? = null
    private lateinit var mSwipeView: SwipePlaceHolderView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mContext = this

        mSwipeView = swipeView

        mSwipeView.getBuilder<SwipePlaceHolderView, SwipeViewBuilder<SwipePlaceHolderView>>()
                .setDisplayViewCount(3)
                .setSwipeType(SwipePlaceHolderView.SWIPE_TYPE_DEFAULT)
                .setIsUndoEnabled(true)
                .setSwipeDecor(SwipeDecor()
                        .setPaddingTop(20)
                        .setRelativeScale(0.01f)
                        .setSwipeInMsgLayoutId(R.layout.tinder_swipe_in_msg_view)
                        .setSwipeOutMsgLayoutId(R.layout.tinder_swipe_out_msg_view))


        for (profile in Utils.loadProfiles()!!) {
            mSwipeView.addView(TinderCard(mContext, profile, mSwipeView))
        }


        rejectBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                mSwipeView.doSwipe(false)
            }
        })

        acceptBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                mSwipeView.doSwipe(true)
            }
        })
    }

    companion object {
        fun newIntent(context: Context): Intent {
            val intent = Intent(context, MainActivity::class.java)
            return intent
        }
    }
}

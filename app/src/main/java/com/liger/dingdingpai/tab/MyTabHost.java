/*
package com.liger.dingdingpai.tab;

import java.util.List;

import android.content.Context;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabWidget;

*/
/**
 * Created by longkai on 5/22/16.
 *//*

public class MyTabHost extends ViewGroup {
  private TabWidget tabWidget;
  private List<Parcelable> datas;
  private List<Integer> viewIds;
  private int lastIndex;

  public MyTabHost(Context context) {
    this(context, null);
  }

  public MyTabHost(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public void setTabWidget(TabWidget tabWidget) {
    this.tabWidget = tabWidget;
    // package level, use reflection...

    tabWidget.setTabSelectionListener(new TabWidget.OnTabSelectionChanged() {
      public void onTabSelectionChanged(int tabIndex, boolean clicked) {
        View willBeRemoved = getChildAt(0);
        Parcelable savedData = willBeRemoved.onSaveInstanceState();
        datas.set(lastIndex, savedData);

        View view = LayoutInflater.from(getContext()).inflate(viewIds.get(tabIndex), MyTabHost.this);
        Parcelable parcelable = datas.get(tabIndex);
        view.onRestoreInstanceState(parcelable);
        addView(view, 0);

        lastIndex = tabIndex;
      }
    });
  }

  public void addTab(int index, String tag, int viewId) {
    tabWidget.addView(); // create tab indicator
    datas.add(null); // first is null, no data
    viewIds.add(viewId);
  }

  @Override protected Parcelable onSaveInstanceState() {
    return super.onSaveInstanceState();
  }

  @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    // only one child
    View view = getChildAt(0);
    if (view != null && view.getVisibility() != GONE) {
      measureChild(
              view,
              MeasureSpec.makeMeasureSpec(getMeasuredWidth(), MeasureSpec.EXACTLY),
              MeasureSpec.makeMeasureSpec(getMeasuredHeight(), MeasureSpec.EXACTLY)
      );
    }
  }

  @Override protected void onLayout(boolean changed, int l, int t, int r, int b) {
    View view = getChildAt(0);
    if (view != null && view.getVisibility() != GONE) {
      view.layout(l, t, l + view.getMeasuredWidth(), t + view.getMeasuredHeight());
    }
  }
}
*/

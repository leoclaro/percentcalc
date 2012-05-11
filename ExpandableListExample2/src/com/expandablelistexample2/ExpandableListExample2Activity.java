package com.expandablelistexample2;

import android.app.ExpandableListActivity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ExpandableListExample2Activity extends ExpandableListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		setListAdapter(new ExampleAdapter(this));        
	}

	private class ExampleAdapter extends BaseExpandableListAdapter {
		private Context context;
		public ExampleAdapter(Context context) {
			this.context = context;
		}
		@Override
		public Object getChild(int groupPosition, int childPosition) {
			return null;
		}
		@Override
		public long getChildId(int groupPosition, int childPosition) {
			return 0;
		}

		/**
		 *  getChildView overridden method will have responsibility of
		 *  constructing View for the child element when corresponding
		 *  group element is activated by click / touch action.
		 */

		@Override
		public View getChildView(int groupPosition, int childPosition,
				boolean isLastChild, View convertView, ViewGroup parent) {
			LinearLayout linear = new LinearLayout(this.context);
			ImageView imView1 = null;
			ImageView imView2 = null;
			ImageView imView3 = null;
			ImageView imView4 = null;

			if(groupPosition == 0) {
				imView1 = new ImageView(this.context);
				imView1.setImageResource(android.R.drawable.btn_star_big_off);
				imView2 = new ImageView(this.context);
				imView2.setImageResource(android.R.drawable.btn_star_big_off);
				imView3 = new ImageView(this.context);
				imView3.setImageResource(android.R.drawable.btn_star_big_off);
				imView4 = new ImageView(this.context);
				imView4.setImageResource(android.R.drawable.btn_star_big_off);

				linear.addView(imView1);
				linear.addView(imView2);
				linear.addView(imView3);
				linear.addView(imView4);				
			}
			if(groupPosition == 1) {
				imView1 = new ImageView(this.context);
				imView1.setImageResource(android.R.drawable.btn_star_big_on);
				imView2 = new ImageView(this.context);
				imView2.setImageResource(android.R.drawable.btn_star_big_on);
				imView3 = new ImageView(this.context);
				imView3.setImageResource(android.R.drawable.btn_star_big_on);
				imView4 = new ImageView(this.context);
				imView4.setImageResource(android.R.drawable.btn_star_big_on);

				linear.addView(imView1);
				linear.addView(imView2);
				linear.addView(imView3);
				linear.addView(imView4);				
			}
			return linear;
		}
		@Override
		public int getChildrenCount(int groupPosition) {
			return 1;
		}
		@Override
		public Object getGroup(int groupPosition) {
			return null;
		}
		@Override
		public int getGroupCount() {
			return 2;
		}
		@Override
		public long getGroupId(int groupPosition) {
			return 0;
		}
		@Override
		public View getGroupView(int groupPosition, boolean isExpanded,
				View convertView, ViewGroup parent) {
			LinearLayout linear = new LinearLayout(this.context);
			ImageView imView = null;
			if(groupPosition == 0) {
				TextView txtView = new TextView(this.context);
				txtView.setText("Cup Board :");
				txtView.setTextColor(Color.BLACK);
				linear.addView(txtView);
				imView = new ImageView(this.context);
				imView.setImageResource(android.R.drawable.btn_star_big_off);
				linear.addView(imView);
			}
			if(groupPosition == 1) {
				TextView txtView = new TextView(this.context);
				txtView.setText("Cameras :");
				txtView.setTextColor(Color.BLACK);
				linear.addView(txtView);
				imView = new ImageView(this.context);
				imView.setImageResource(android.R.drawable.btn_star_big_on);
				linear.addView(imView);
			}
			return linear;
		}
		@Override
		public boolean hasStableIds() {
			return false;
		}
		@Override
		public boolean isChildSelectable(int groupPosition, 
				int childPosition) {
			return true;
		}
	}
}
package com.expandablelist3;

import android.app.ExpandableListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ExpandableListExample3Activity extends ExpandableListActivity {
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

			if(groupPosition == 0) {
				imView1 = new ImageView(this.context);
				imView1.setImageResource(android.R.drawable.btn_star_big_off);
				
				linear.addView(imView1);			
			}
			if(groupPosition == 1) {
				imView1 = new ImageView(this.context);
				imView1.setImageResource(android.R.drawable.btn_star_big_on);

				linear.addView(imView1);				
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
			
			if(groupPosition == 0) {
				TextView txtView = new TextView(this.context);
				txtView.setText("Cup Board :");
				//txtView.setHeight(30);
				txtView.setPadding(25, 10, 0, 5);				
				linear.addView(txtView);				
			}
			if(groupPosition == 1) {
				TextView txtView = new TextView(this.context);
				txtView.setText("Cameras :");
				txtView.setPadding(25, 10, 0, 5);
				linear.addView(txtView);
				
			}
			return linear;
		}
		@Override
		public boolean hasStableIds() {
			return false;
		}
		@Override
		public boolean isChildSelectable(int groupPosition, int childPosition) {
			return true;
		}
	}
}
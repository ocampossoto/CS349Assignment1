import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends
        RecyclerView.Adapter<ItemAdapter.ViewHolder>{

    private List<Items_Box> mContacts;
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public Button messageButton;

        public ViewHolder(View itemView){
            super(itemView);

            nameTextView = itemView.findViewById(R.id.data)

        }

    }

}

package simple.example.hewanpedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import simple.example.hewanpedia.model.Pakaian;

public class DaftarAdapterActifity extends ArrayAdapter<Pakaian> {
    Context context;

    public DaftarAdapterActifity (Context context, List<Pakaian> pakaians) {
        super(context , R.layout.row_daftarsendal, pakaians);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView textJenis;
        TextView textAsal;
        ImageView gambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Pakaian pakaian = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_daftarsendal, parent, false);
            viewHolder.textJenis =  convertView.findViewById(R.id.row_text_jenis);
            viewHolder.textAsal = (TextView) convertView.findViewById(R.id.row_text_asal);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_hewan);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textJenis.setText(pakaian.getJenis());
        viewHolder.textAsal.setText(pakaian.getRas());
        viewHolder.gambar.setImageDrawable(context.getDrawable(pakaian.getDrawableRes()));
        return convertView;
    }
}

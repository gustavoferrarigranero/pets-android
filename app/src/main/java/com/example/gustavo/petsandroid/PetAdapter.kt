package com.example.gustavo.petsandroid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class PetAdapter(private val context: Context,
                 private val dataSource: ArrayList<Pet>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    private class ViewHolder {
        lateinit var nameTxt: TextView
        lateinit var ageTxt: TextView
        lateinit var imageView: ImageView
    }

    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //4
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view: View
        val holder: ViewHolder

        val pet: Pet = getItem(position) as Pet

        if (convertView == null) {

            view = inflater.inflate(R.layout.my_pet_card_view, parent, false)

            holder = ViewHolder()
            holder.imageView = view.findViewById(R.id.petImageView) as ImageView
            holder.nameTxt = view.findViewById(R.id.petName) as TextView
            holder.ageTxt = view.findViewById(R.id.petAge) as TextView

            view.tag = holder
        } else {
            view = convertView
            holder = convertView.tag as ViewHolder
        }

        holder.nameTxt.setText(pet.getName())
        holder.ageTxt.setText(pet.getAge())
        Glide.with(context).load(pet.getImageUrl()).asBitmap().into(holder.imageView)

        return view
    }
}
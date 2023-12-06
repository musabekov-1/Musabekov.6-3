import androidx.recyclerview.widget.RecyclerView
import com.example.musabekov6_3.databinding.ItemBrandsBinding

class ViewHolder(private val binding: ItemBrandsBinding) : RecyclerView.ViewHolder(binding.root) {
    fun <Brand> bind(brand: Brand) {
        binding.brand = brand
        binding.executePendingBindings()
    }
}




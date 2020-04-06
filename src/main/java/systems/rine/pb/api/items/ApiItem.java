package systems.rine.pb.api.items;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ApiItem {

	@SerializedName("name")
	public String name;
	@SerializedName("description")
	public String description;
	@SerializedName("type")
	public String type;
	@SerializedName("level")
	public Integer level;
	@SerializedName("rarity")
	public String rarity;
	@SerializedName("vendor_value")
	public Integer vendorValue;
	@SerializedName("default_skin")
	public String defaultSkin;
	@SerializedName("game_types")
	public List<String> gameTypes = null;
	@SerializedName("flags")
	public List<String> flags = null;
	@SerializedName("restrictions")
	public List<Object> restrictions = null;
	@SerializedName("id")
	public Integer id;
	@SerializedName("chat_link")
	public String chatLink;
	@SerializedName("icon")
	public String icon;
	@SerializedName("upgrades_from")
	public List<ApiUpgradeItem> upgradesFrom;
	@SerializedName("upgrades_into")
	public List<ApiUpgradeItem> upgradesInto;
	@SerializedName("details")
	public ApiItemDetails itemObject;


}
package web.entity;

public class Goods {
    private Integer id;

    private String name;

    private Double inprice;

    private Double saleinprice;

    private Integer num;

    private String discription;

    private Double discount;

    private String productplace;

    private String unit;

    private String standard;

    private Integer salenum;

    private Integer status;
    
    private String picture;
    
    private Integer good_type;

    public Integer getGood_type() {
		return good_type;
	}

	public void setGoods_type(Integer good_type) {
		this.good_type = good_type;
	}

	private GoodsType type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getInprice() {
        return inprice;
    }

    public void setInprice(Double inprice) {
        this.inprice = inprice;
    }

    public Double getSaleinprice() {
        return saleinprice;
    }

    public void setSaleinprice(Double saleinprice) {
        this.saleinprice = saleinprice;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription == null ? null : discription.trim();
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getProductplace() {
        return productplace;
    }

    public void setProductplace(String productplace) {
        this.productplace = productplace == null ? null : productplace.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public Integer getSalenum() {
        return salenum;
    }

    public void setSalenum(Integer salenum) {
        this.salenum = salenum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

	public GoodsType getType() {
		return type;
	}

	public void setType(GoodsType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", inprice=" + inprice + ", saleinprice=" + saleinprice + ", num="
				+ num + ", discription=" + discription + ", discount=" + discount + ", productplace=" + productplace
				+ ", unit=" + unit + ", standard=" + standard + ", salenum=" + salenum + ", status=" + status
				+ ", picture=" + picture + ", good_type=" + good_type + ", type=" + type + "]";
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	
 
}
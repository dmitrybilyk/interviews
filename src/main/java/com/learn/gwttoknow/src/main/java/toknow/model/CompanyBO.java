package toknow.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "company")
@XmlAccessorType(XmlAccessType.FIELD)
public class CompanyBO extends BaseBean {
  private static final long serialVersionUID = -7346979224267478560L;

  public CompanyBO() {

  }

  public enum Fields {
    DISPLAY_NAME("displayName"), CONFIGURATION_EQUAL_GROUP("configurationEqualGroup"), DESC("description"),
    COMPANY_ID("companyid");
    private final String fieldName;

    Fields(final String fieldName) {
      this.fieldName = fieldName;
    }

    public String getFieldName() {
      return fieldName;
    }

    public static Fields getField(String fieldName) {
      for (Fields field: Fields.values())
        if (field.getFieldName().equals(fieldName))
          return field;
      return null;
    }
  }
  private Integer companyid;
  private String displayName = "";
  private String configurationEqualGroup = "";
  private String description = "";

  @Override
  public Integer getId() {
    return getCompanyid();
  }

  @Override
  public void setId(Integer value) {
    setCompanyid(value);
  }

  public Integer getCompanyid() {
    return companyid;
  }

  //used by ibatis
  public void setCompanyid(Integer companyid) {
    if (isLocked()) {
      throw new UnsupportedOperationException("You cannot set a primary key");
    }
    this.companyid = companyid;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    markChanged(this.displayName, displayName == null ? "" : displayName.trim());
    this.displayName = displayName == null ? "" : displayName.trim();
  }

  public String getConfigurationEqualGroup() {
    return configurationEqualGroup;
  }

  public void setConfigurationEqualGroup(String configurationEqualGroup) {
    markChanged(this.configurationEqualGroup, configurationEqualGroup == null ? "" : configurationEqualGroup.trim());
    this.configurationEqualGroup = configurationEqualGroup == null ? "" : configurationEqualGroup.trim();
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    markChanged(this.description, description == null ? "" : description.trim());
    this.description = description == null ? "" : description.trim();
  }

  @Override
  public int hashCode() {
    return getCompanyid() == null ? 0 : getCompanyid().hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof CompanyBO)) {
      return false;
    }
    CompanyBO other = (CompanyBO) obj;
    return getCompanyid() != null && other.getCompanyid() != null && getCompanyid().equals(other.getCompanyid());
  }

  public String toString() {
    return "CompanyBO(" + companyid + ": " + displayName + ": '" + description + "')";
  }

  @Override
  public BaseBean newInstance() {
    return new CompanyBO();
  }

  @Override
  public List<SearchOrder> defaultSortOrder() {
    List<SearchOrder> ordering = new ArrayList<SearchOrder>();
    ordering.add(new SearchOrder(Fields.DISPLAY_NAME, SearchOrder.Direction.ASC));
    return ordering;
  }

  public CompanyBO(CompanyBOBuilder builder) {
    this.companyid = builder.companyid;
    this.displayName = builder.displayName;
    this.description = builder.description;
    this.configurationEqualGroup = builder.configurationEqualGroup;
  }

  public static class CompanyBOBuilder{
    private Integer companyid;
    private String displayName = "";
    private String configurationEqualGroup = "";
    private String description = "";

    public CompanyBOBuilder(Integer companyid) {
      this.companyid = companyid;
    }

    public CompanyBOBuilder displayName(String displayName){
      this.displayName = displayName;
      return this;
    }
    public CompanyBOBuilder description(String description){
      this.description = description;
      return this;
    }
    public CompanyBOBuilder configurationEqualGroup(String configurationEqualGroup){
      this.configurationEqualGroup = configurationEqualGroup;
      return this;
    }

    public CompanyBO build(){
      return new CompanyBO(this);
    }
  }

}

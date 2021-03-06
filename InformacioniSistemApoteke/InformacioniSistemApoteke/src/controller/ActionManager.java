package controller;

public class ActionManager {

	private LoginController loginController;
	private ShowAllMedicamentsController showAllMedicamentsController;
	private ShowAllRecipesController showAllRecipesController;
	private SearchMedicamentsController searchMedicamentsController;
	private SearchRecipesController searchRecipesController;
	private RegisterUserController registerUserController;
	private ShowAllUsersController showAllUsersController;
	private CreateMedicamentController createMedicamentController;
	private EditMedicamentController editMedicamentController;
	private CreateRecipeController createRecipeController;
	private DeleteMedicamentController deleteMedicamentController;
	private DeleteRecipeController deleteRecipeController;
	private SellMedicamentController sellMedicament; 
	private ListTransactionsController listTransactionsController;


	public ActionManager() {
	}

	public void initialize() {
		loginController = new LoginController();
		showAllMedicamentsController = new ShowAllMedicamentsController();
		showAllRecipesController = new ShowAllRecipesController();
		searchMedicamentsController = new SearchMedicamentsController();
		searchRecipesController = new SearchRecipesController();
		registerUserController = new RegisterUserController();
		showAllUsersController = new ShowAllUsersController();
		createMedicamentController = new CreateMedicamentController();
		editMedicamentController = new EditMedicamentController();
		createRecipeController = new CreateRecipeController();
		deleteMedicamentController = new DeleteMedicamentController();
		deleteRecipeController = new DeleteRecipeController();
		sellMedicament = new SellMedicamentController();
		listTransactionsController = new ListTransactionsController();
	}

	public LoginController getLoginController() {
		return loginController;
	}

	public void setLoginController(LoginController loginController) {
		this.loginController = loginController;
	}

	public ShowAllMedicamentsController getShowAllMedicamentsController() {
		return showAllMedicamentsController;
	}

	public void setShowAllMedicamentsController(ShowAllMedicamentsController showAllMedicamentsController) {
		this.showAllMedicamentsController = showAllMedicamentsController;
	}

	public ShowAllRecipesController getShowAllRecipesController() {
		return showAllRecipesController;
	}

	public void setShowAllRecipesController(ShowAllRecipesController showAllRecipesController) {
		this.showAllRecipesController = showAllRecipesController;
	}

	public SearchMedicamentsController getSearchMedicamentsController() {
		return searchMedicamentsController;
	}

	public void setSearchMedicamentsController(SearchMedicamentsController searchMedicamentsController) {
		this.searchMedicamentsController = searchMedicamentsController;
	}

	public SearchRecipesController getSearchRecipesController() {
		return searchRecipesController;
	}

	public void setSearchRecipesController(SearchRecipesController searchRecipesController) {
		this.searchRecipesController = searchRecipesController;
	}

	public RegisterUserController getRegisterUserController() {
		return registerUserController;
	}

	public void setRegisterUserController(RegisterUserController registerUserController) {
		this.registerUserController = registerUserController;
	}

	public ShowAllUsersController getShowAllUsersController() {
		return showAllUsersController;
	}

	public void setShowAllUsersController(ShowAllUsersController showAllUsersController) {
		this.showAllUsersController = showAllUsersController;
	}

	public CreateMedicamentController getCreateMedicamentController() {
		return createMedicamentController;
	}

	public void setCreateMedicamentController(CreateMedicamentController createMedicamentController) {
		this.createMedicamentController = createMedicamentController;
	}

	public EditMedicamentController getEditMedicamentController() {
		return editMedicamentController;
	}

	public void setEditMedicamentController(EditMedicamentController editMedicamentController) {
		this.editMedicamentController = editMedicamentController;
	}

	public CreateRecipeController getCreateRecipeController() {
		return createRecipeController;
	}

	public void setCreateRecipeController(CreateRecipeController createRecipeController) {
		this.createRecipeController = createRecipeController;
	}

	public DeleteMedicamentController getDeleteMedicamentController() {
		return deleteMedicamentController;
	}

	public void setDeleteMedicamentController(DeleteMedicamentController deleteMedicamentController) {
		this.deleteMedicamentController = deleteMedicamentController;
	}

	public DeleteRecipeController getDeleteRecipeController() {
		return deleteRecipeController;
	}

	public void setDeleteRecipeController(DeleteRecipeController deleteRecipeController) {
		this.deleteRecipeController = deleteRecipeController;
	}

	public SellMedicamentController getSellMedicament() {
		return sellMedicament;
	}

	public void setSellMedicament(SellMedicamentController sellMedicament) {
		this.sellMedicament = sellMedicament;
	}

	public ListTransactionsController getListTransactionsController() {
		return listTransactionsController;
	}

	public void setListTransactionsController(ListTransactionsController listTransactionsController) {
		this.listTransactionsController = listTransactionsController;
	}
	
}

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarContribuyenteComponent } from './listar-contribuyente.component';

describe('ListarContribuyenteComponent', () => {
  let component: ListarContribuyenteComponent;
  let fixture: ComponentFixture<ListarContribuyenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarContribuyenteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListarContribuyenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
